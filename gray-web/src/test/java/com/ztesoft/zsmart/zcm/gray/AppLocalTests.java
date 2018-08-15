package com.ztesoft.zsmart.zcm.gray;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.ztesoft.zsmart.core.exception.BaseAppException;
import com.ztesoft.zsmart.zcm.gray.domain.GrayRuleOnGraying;
import com.ztesoft.zsmart.zcm.gray.service.GrayRuleService;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("local")
public class AppLocalTests {
	@Autowired
	private GrayRuleService grayruleService;

	@Test
	public void contextLoads() {
	}

	@Test
	public void isGrayRule() throws BaseAppException {
		boolean is_gray = grayruleService.isGrayRule("CG", "1");
		System.out.println("--->" + is_gray);
	}

	@Test
	public void qryGrayRuleListOnGraying(){
		List<GrayRuleOnGraying> list = grayruleService.qryGrayRuleListOnGraying();
		System.out.println("--->" + list);
	}
}
