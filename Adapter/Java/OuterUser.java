import java.util.Map;
import java.util.HashMap;

public class OuterUser implements IOuterUser{
    public Map getUserBaseInfo(){
        HashMap baseInfo = new HashMap();
        baseInfo.put("userName", "The name is ...");
        baseInfo.put("mobileNumber", "The mobile number is ...");

        return baseInfo;
    }

    public Map getUserHomeInfo(){
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumber", "The home telephone number is ...");
        homeInfo.put("homeAddress", "The home address is ...");

        return homeInfo;
    }

    public Map getUserOfficeInfo(){
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition", "The job position is ...");
        officeInfo.put("officeTelNumber", "The office telephone number is ...");

        return officeInfo;
    }
}
