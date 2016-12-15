public class Client{
    public static void main(String[] args){
        IUserInfo youngGirl = new UserInfo();
        for(int i = 0; i < 10; i ++){
            youngGirl.getMobileNumber();
        }

        youngGirl = new OuterUserInfo();
        for(int i = 0; i < 10; i ++){
            youngGirl.getMobileNumber();
        }
    }
}
