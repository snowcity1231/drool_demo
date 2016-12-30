package com.xc.demo;

import java.util.Arrays;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatelessKnowledgeSession;



/** 
* @ClassName: RuleTest 
* @Description: 测试类
* @author xuechen
* @date 2016年12月30日 上午10:47:16 
*  
*/
public class RuleTest {
	
	public static void main(String[] args) {
		RuleTest ruleTest = new RuleTest();
		System.out.println("DISCOUNT IS " + ruleTest.executeExample());
	}
	
	public int executeExample() {
		
		KnowledgeBuilder kBuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		
		kBuilder.add(ResourceFactory.newClassPathResource("rule.drl", getClass()), ResourceType.DRL);
		
		if(kBuilder.hasErrors()) {
			System.err.println( kBuilder.getErrors());
			return -1;
		}
		
		KnowledgeBase kBase = KnowledgeBaseFactory.newKnowledgeBase();
		kBase.addKnowledgePackages(kBuilder.getKnowledgePackages());
		
		StatelessKnowledgeSession kSession = kBase.newStatelessKnowledgeSession();
		
		Order order = new Order();
		order.setDiscountPercent(100);
		order.setSumprice(35);
		
		kSession.execute(Arrays.asList(new Object[]{order}));
		
		return order.getDiscountPercent();
	}
}
