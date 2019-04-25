import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.xml.sax.*;

import javax.xml.parsers.SAXParser;
import java.io.File;
import java.io.InputStream;
import java.util.List;

/**
 * 解析xml代码
 */
public class parseXML {
    public static void main(String [] args){
        //1.构建saxreader对象
        SAXReader saxParser = new SAXReader();

        try {
            //2.指定解析源
            //Document document = saxParser.read(new File("stu.xml"));
            //采用类加载器获得资源流
            InputStream is = parseXML.class.getClassLoader().getResourceAsStream("stu.xml");
            Document document = saxParser.read(is);
            //3.开始解析
            Element rootelement= document.getRootElement();
            System.out.println("root_element="+rootelement.getName());

            //4.获取子节点
            List<Element> elementList = rootelement.elements();

            //遍历出来的每一个<stu>变迁
            for(Element element : elementList){
                System.out.println(element.element("name"));
                System.out.println(element.element("age"));
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }

    }
}
