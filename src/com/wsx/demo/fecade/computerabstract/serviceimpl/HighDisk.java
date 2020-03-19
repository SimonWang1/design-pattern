package com.wsx.demo.fecade.computerabstract.serviceimpl;

import com.wsx.demo.fecade.computerabstract.service.Disk;

// 高配光驱具体产品（业务实现）
public class HighDisk implements Disk{
	
	@Override
	public void startup() {
		System.out.println("128G SSD startup!");
	}
	
	@Override
	public void shutdown() {
		System.out.println("128G SSD shutdown!");
	}
}
