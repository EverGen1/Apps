import co.gem.*;
public class GettingStarted{
 public static void main(String[] args) throws IOException,
 Client.UnexpectedStatusCodeException{
  Round client = Round.client(“https://api.gem.co”);
  User.Wrapper newUser = null;
   try{
    newUser = client.users().create(“admin@evergencompany.com”, “pass-word”, “testate”);
   }catch (InvalidKeySpecException e){
    e.printStackTrace();
  }catch (NoSuchAlgorithmException e)(
   e.printStackTrace();
  }
  System.out.printIn(“Backup Seed: “, + newUser.backupPrivateSeed);
  String key = client.beginDeviceAuth(USER_EMAIL, 93TqPn21zJaQZPDZvyqj_hbslJMn_cgSup9YLtW_oMQ, DEVICE_ID, key, otp);
  String otp = Utils.getUserInput(“Enter OTP: “);
  User authUser = client.authenticateDevice
}
