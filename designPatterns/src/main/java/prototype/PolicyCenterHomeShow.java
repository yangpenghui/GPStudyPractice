package prototype;


import java.io.Serializable;

/**
 * 政策中心（正式项目中的部分代码）
 * @Author: yangph
 * @Date: 2019/3/27 17:17
 * @Version v1.0
 * @modified By:
 */
public class PolicyCenterHomeShow implements Serializable {
    //政策id
    private String policyId;
    //政策编码
    private String policyCode;
    //政策级别编码
    private String policyLevelCode;
    //政策级别名称
    private String policyLevelName;
    //政策分类编码
    private String policyClassCode;
    //政策分类名称
    private String policyClassName;
    //政策类型(0：普通政策  1：图解政策)
    private String policyType;
    //图解政策url(政策类型为普通政策时值为空，为图解政策时有值)
    private String policyDiagramUrl;
    //专题类型(0：一号专题   1：民营专题)
    private String thematicType;
    //政策标题
    private String policyTitle;
    //阅读次数
    private Integer readNum;
    //发布日期
    private String releaseDate;
    //状态(0:无效  1:有效)
    private String status;
    //支持方式(1:奖励  2:其他)
    private String supportMethod;
    //支持产业(1:所有产业  2:其他)
    private String supportIndustry;
    //发文单位
    private String issueUnit;
    //简要内容
    private String briefContent;
    //有无关联政策图解(0:无  1:有)
    private String isPolicyDiagram;
    //关联的政策图解id
    private String relationPolicyDiagramId;
    //有无关联政策原文(0:无  1:有)
    private String isPolicyOriginal;
    //关联的政策原文id
    private String relationPolicyOriginalId;

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getPolicyCode() {
        return policyCode;
    }

    public void setPolicyCode(String policyCode) {
        this.policyCode = policyCode;
    }

    public String getPolicyLevelCode() {
        return policyLevelCode;
    }

    public void setPolicyLevelCode(String policyLevelCode) {
        this.policyLevelCode = policyLevelCode;
    }

    public String getPolicyLevelName() {
        return policyLevelName;
    }

    public void setPolicyLevelName(String policyLevelName) {
        this.policyLevelName = policyLevelName;
    }

    public String getPolicyClassCode() {
        return policyClassCode;
    }

    public void setPolicyClassCode(String policyClassCode) {
        this.policyClassCode = policyClassCode;
    }

    public String getPolicyClassName() {
        return policyClassName;
    }

    public void setPolicyClassName(String policyClassName) {
        this.policyClassName = policyClassName;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public String getPolicyDiagramUrl() {
        return policyDiagramUrl;
    }

    public void setPolicyDiagramUrl(String policyDiagramUrl) {
        this.policyDiagramUrl = policyDiagramUrl;
    }

    public String getThematicType() {
        return thematicType;
    }

    public void setThematicType(String thematicType) {
        this.thematicType = thematicType;
    }

    public String getPolicyTitle() {
        return policyTitle;
    }

    public void setPolicyTitle(String policyTitle) {
        this.policyTitle = policyTitle;
    }

    public Integer getReadNum() {
        return readNum;
    }

    public void setReadNum(Integer readNum) {
        this.readNum = readNum;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSupportMethod() {
        return supportMethod;
    }

    public void setSupportMethod(String supportMethod) {
        this.supportMethod = supportMethod;
    }

    public String getSupportIndustry() {
        return supportIndustry;
    }

    public void setSupportIndustry(String supportIndustry) {
        this.supportIndustry = supportIndustry;
    }

    public String getIssueUnit() {
        return issueUnit;
    }

    public void setIssueUnit(String issueUnit) {
        this.issueUnit = issueUnit;
    }

    public String getBriefContent() {
        return briefContent;
    }

    public void setBriefContent(String briefContent) {
        this.briefContent = briefContent;
    }

    public String getIsPolicyDiagram() {
        return isPolicyDiagram;
    }

    public void setIsPolicyDiagram(String isPolicyDiagram) {
        this.isPolicyDiagram = isPolicyDiagram;
    }

    public String getRelationPolicyDiagramId() {
        return relationPolicyDiagramId;
    }

    public void setRelationPolicyDiagramId(String relationPolicyDiagramId) {
        this.relationPolicyDiagramId = relationPolicyDiagramId;
    }

    public String getIsPolicyOriginal() {
        return isPolicyOriginal;
    }

    public void setIsPolicyOriginal(String isPolicyOriginal) {
        this.isPolicyOriginal = isPolicyOriginal;
    }

    public String getRelationPolicyOriginalId() {
        return relationPolicyOriginalId;
    }

    public void setRelationPolicyOriginalId(String relationPolicyOriginalId) {
        this.relationPolicyOriginalId = relationPolicyOriginalId;
    }

    @Override
    public String toString() {
        return "PolicyCenterHomeShow{" +
                "policyId='" + policyId + '\'' +
                ", policyCode='" + policyCode + '\'' +
                ", policyLevelCode='" + policyLevelCode + '\'' +
                ", policyLevelName='" + policyLevelName + '\'' +
                ", policyClassCode='" + policyClassCode + '\'' +
                ", policyClassName='" + policyClassName + '\'' +
                ", policyType='" + policyType + '\'' +
                ", policyDiagramUrl='" + policyDiagramUrl + '\'' +
                ", thematicType='" + thematicType + '\'' +
                ", policyTitle='" + policyTitle + '\'' +
                ", readNum=" + readNum +
                ", releaseDate='" + releaseDate + '\'' +
                ", status='" + status + '\'' +
                ", supportMethod='" + supportMethod + '\'' +
                ", supportIndustry='" + supportIndustry + '\'' +
                ", issueUnit='" + issueUnit + '\'' +
                ", briefContent='" + briefContent + '\'' +
                ", isPolicyDiagram='" + isPolicyDiagram + '\'' +
                ", relationPolicyDiagramId='" + relationPolicyDiagramId + '\'' +
                ", isPolicyOriginal='" + isPolicyOriginal + '\'' +
                ", relationPolicyOriginalId='" + relationPolicyOriginalId + '\'' +
                '}';
    }
}
