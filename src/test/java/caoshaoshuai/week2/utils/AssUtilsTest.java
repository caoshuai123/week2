package caoshaoshuai.week2.utils;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
/**
 * 
 * @ClassName: AssUtilsTest 
 * @Description: TODO
 * @author: 曹少帅·
 * @date: 2019年7月15日 上午9:19:25
 */
public class AssUtilsTest {
/**
 * 
 * @Title: testIsTrue 
 * @Description: //方法1：断言为真，如果为假，则抛出自定义异常，
 *      异常消息为第2个参数默认消息。 (5分)
 * @return: void
 */
	@Test
	public void testIsTrue() {
		//AssUtils.isTrue(1>0, "为真");
		AssUtils.isTrue(1<0, "为真");
	}

	/**
	 * 
	 * @Title: testIsFalse 
	 * @Description: //方法2：断言为假，
	 * @return: void
	 */
	@Test
	public void testIsFalse() {
		AssUtils.isFalse(1>0, "为假");
	  //AssUtils.isFalse(1<0, "为假");
	}
	
   ////方法3：断言对象不为空，
	@Test
	public void testNotNull() {
		//AssUtils.notNull(null, "不为空");
		AssUtils.notNull(1, "不为空");
	}
/**
 * 
 * @Title: testIsNull 
 * @Description: TODO
 * @return: void
 */
	//方法4：断言对象必须空
	@Test
	public void testIsNull() {
		//AssUtils.isNull(null, "为空");
		AssUtils.isNull(1, "为空");
	}

	//方法5：断言集合不为空，
	@Test
	public void testNotEmptyCollectionOfQString() {
		List list = new ArrayList();
		list.add(1);
		
		
		AssUtils.notEmpty(list, "集合不为空");
	}

	//方法6：断言Map集合不为空，
	//notEmpty
	@Test
	public void testNotEmptyMapOfQQString() {
		Map<String,String> map = new HashMap<String, String>();
		map.put("1", "1");
		
		AssUtils.notEmpty(map, "map集合不为空");
	}

	//方法7：断言字符串必须有值，
	@Test
	public void testHasText() {
		AssUtils.hasText(" ", "字符串不为空");
		//AssUtils.hasText("1", "字符串不为空");
	}

	//方法8：断言值必须大于0
	@Test
	public void testGreaterThanZero() {
		//BigDecimal b = new BigDecimal("-1");
		BigDecimal b = new BigDecimal("1");
		AssUtils.greaterThanZero(b, "为正数");
		
	}

}
