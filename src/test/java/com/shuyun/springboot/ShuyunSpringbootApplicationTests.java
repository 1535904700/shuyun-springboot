package com.shuyun.springboot;

import com.shuyun.springboot.dao.UserMapper;
import com.shuyun.springboot.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;


@SpringBootTest
class ShuyunSpringbootApplicationTests {

    @Resource
    private UserMapper userMapper;

    @Test
    void contextLoads() {

    }

    /*@Test
    void serialization() throws IOException, ClassNotFoundException {
        TestSerialization testSerialization = new TestSerialization();
        //FileOutputStream fileOutputStream = new FileOutputStream("D:\\file\\write.out");
        //ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
        //oos.writeObject(testSerialization);
        //oos.close();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String jsonString = JSON.toJSONString(testSerialization);
        baos.write(jsonString.getBytes(),0,jsonString.length());

        byte[] bytes = new byte[jsonString.length()];
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        int read = -1;
        int index = 0;
        while ((read = bais.read()) != -1) {
            baos.write(read);
            bytes[index++] = (byte) read;
        }
        JSON.parse(bytes.toString());

        FileInputStream fis = new FileInputStream("D:\\file\\write.out");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object o = ois.readObject();
        if (o instanceof TestSerialization) {
            TestSerialization test = (TestSerialization)o;
            System.out.println(test.getName());
            System.out.println(TestSerialization.getAge());
        }
    }*/

    @Test
    void mapper() {
        User user = userMapper.selectById(1);
        System.out.println("年龄：" + user.getAge() + "\t\t姓名：" + user.getName());
    }

}
