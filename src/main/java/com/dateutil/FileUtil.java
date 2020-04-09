package com.dateutil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.songgaochao.common.utils.StreamUtil;

public class FileUtil {

	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(10分)
	*/
	public static String getExtendName(String fileName){
		List<String> list = new ArrayList<String>();
		BufferedReader br = null;
		try {
			String str = "";
			br = new BufferedReader(new FileReader(file));
			while((str=br.readLine())!=null) {
				list.add(str);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			StreamUtil.close(br);
		}
		return list;
	//TODO 实现代码
	}
}
