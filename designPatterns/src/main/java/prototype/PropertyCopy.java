package prototype;



import org.springframework.beans.BeanUtils;

import java.util.UUID;

/**
 * 属性赋值，利用原型模式完成赋值
 * @Author: yangph
 * @Date: 2019/4/1 0:58
 * @Version v1.0
 * @modified By:
 */
public class PropertyCopy {
    public static void main(String[] args) {
        PolicyCenterHomeShow policyCenterHomeShow=new PolicyCenterHomeShow();

        TbPolicy tbPolicy=new TbPolicy();
        tbPolicy.setPolicyId(UUID.randomUUID().toString().replaceAll("-",""));
        tbPolicy.setPolicyCode("jn-xd012223");
        tbPolicy.setPolicyClassCode("technologyFinancial");
        tbPolicy.setPolicyClassName("科技金融");
        tbPolicy.setPolicyDiagramUrl("www.1236/dsf/fdf333.jpg");
        tbPolicy.setPolicyLevelCode("area_level");
        tbPolicy.setPolicyLevelName("区域级");

        //利用BeanUtils的copyProperties方法完成赋值
        BeanUtils.copyProperties(tbPolicy,policyCenterHomeShow);
        System.out.println(policyCenterHomeShow.toString());
    }
}
