package com.wsx.demo.fecade.computerabstract.serviceimpl;

import com.wsx.demo.fecade.computerabstract.service.Disk;

// 普通光驱具体产品（业务实现）
public class CommonDisk implements Disk{
	
	@Override
	public void startup() {
		System.out.println("disk startup!");
	}
	
	@Override
	public void shutdown() {
		System.out.println("disk shutdown!");
	}
}
