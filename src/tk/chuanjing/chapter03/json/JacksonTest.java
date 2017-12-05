package tk.chuanjing.chapter03.json;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ser.FilterProvider;
import org.codehaus.jackson.map.ser.impl.SimpleBeanPropertyFilter;
import org.codehaus.jackson.map.ser.impl.SimpleFilterProvider;
import org.junit.Test;

import tk.chuanjing.chapter03.domain.Product;

/**
 * @author ChuanJing
 * @date 2017年7月13日 上午2:39:46
 * @version 1.0
 */
public class JacksonTest {

	/**
	 * 将Product转换成json
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonGenerationException 
	 */
	@Test
	public void test1() throws JsonGenerationException, JsonMappingException, IOException {
		Product p = new Product();
		p.setId(1);
		p.setName("电视机");
		p.setPrice(2000);
		p.setReleaseDate(new Date());
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
		String json = mapper.writeValueAsString(p);
		
		System.out.println(json);
	}
	
	/**
	 * 将List<Product>转换成json
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@Test
	public void test2() throws JsonGenerationException, JsonMappingException, IOException {
		Product p1 = new Product();
		p1.setId(1);
		p1.setName("电视机");
		p1.setPrice(2000);
		p1.setReleaseDate(new Date());

		Product p2 = new Product();
		p2.setId(2);
		p2.setName("电冰箱");
		p2.setPrice(3000);
		p2.setReleaseDate(new Date());

		List<Product> ps = new ArrayList<Product>();
		ps.add(p1);
		ps.add(p2);
		
		ObjectMapper mapper = new ObjectMapper();
		
		// 处理过滤属性
//		FilterProvider fp = new SimpleFilterProvider().addFilter("productFilter",
//				SimpleBeanPropertyFilter.filterOutAllExcept("id", "name")); //只包含id与name
		
		FilterProvider fp = new SimpleFilterProvider().addFilter("productFilter",
				SimpleBeanPropertyFilter.serializeAllExcept("id", "name")); //不包含id与name
		
		mapper.setFilters(fp);
		
		String json = mapper.writeValueAsString(ps);
		System.out.println(json);
	}
}
