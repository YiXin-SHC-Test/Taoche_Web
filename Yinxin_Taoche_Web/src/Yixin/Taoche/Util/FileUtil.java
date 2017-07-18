package Yixin.Taoche.Util;

import java.io.File;

public class FileUtil {
	public static boolean createFile(String destFileName) {
		File file = new File(destFileName);
		if (file.exists()) {
			System.out.println("创建单个文件" + destFileName + "失败，目标文件已存在！");
			return false;
		}
		if (destFileName.endsWith(file.separator)) {
			System.out.println("创建单个文件" + destFileName + "失败，目标文件不能为目录!");
			return false;
		}
		// 判断目标文件所在目录是否存在
		if (!file.getParentFile().exists()) {
			// 如果目标文件所在目录不存在，则创建父目录
			System.out.println("目标文件所在目录不存在，准备创建它！");
			if (!file.getParentFile().mkdir()) {
				System.out.println("创建目标文件所在目录失败！");
				return false;
			}
		}
		// 创建目标文件
		try {
			if (file.createNewFile()) {
				System.out.println("创建单个文件" + destFileName + "成功");
				return true;
			} else {
				System.out.println("创建单个文件" + destFileName + "失败");
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out
					.println("创建单个文件" + destFileName + "失败！" + e.getMessage());
			return false;
		}
	}

	public static boolean createDir(String destDirName) {
		File dir = new File(destDirName);
		if (dir.exists()) {
			System.out.println("创建目录" + destDirName + "失败，目标目录已经存在");
			return false;
		}
		// 创建目录
		if (dir.mkdirs()) {
			System.out.println("创建目录" + destDirName + "成功！");
			return true;
		} else {
			System.out.println("创建目录" + destDirName + "失败！");
			return false;
		}
	}
}
