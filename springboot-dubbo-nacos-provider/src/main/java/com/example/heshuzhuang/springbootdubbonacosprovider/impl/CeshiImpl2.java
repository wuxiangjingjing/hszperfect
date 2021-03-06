package com.example.heshuzhuang.springbootdubbonacosprovider.impl;

import com.example.hehsuzhuang.springbootdubbonacosbase.service.ICeshi;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;


/**
 * @author heshuzhuang
 * @Date 2020/3/5 13:57
 */
@Slf4j
@Service( interfaceName = "test02",group = "test02")
public class CeshiImpl2 implements ICeshi {

	@Override
	public String ceshi() {
		log.info("走到了测试2");
		return "测试2";
	}
}
