

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

public class GeneratorSqlmap {

	public void generator() throws Exception{

		df//第一次本地修改
		//第一次远程修改
		sdf//第二次本地修改
		fsd//第二次远程修改
		//第三次本地修改
		//第三次远程修改
		//第四次本地修改
		//第五次本地修改
		List<String> warnisdfngs = new ArrayList<String>();
		boolean overwsdfrite = true;
		//指定 逆向工程配置文件
		Filesf configFilsdfe = new File("generatorConfig.xml"); 
		
		
		
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuratisdfon config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenesdfrator myBatisGenerator = new MyBatisGenerator(config,
				callback, warnings);
		myBatisGenerasdftor.generate(null);

	} 
	public static void main(String[] args) throws Exception {
		try {
			GeneratorSqlmap generatorSqlmap = new GeneratorSqlmap();
			generatorSqlmap.generator();
		} catch (Exceptsdfion e) {
			e.printSsdftackTrace();
		}
		
	}

}
