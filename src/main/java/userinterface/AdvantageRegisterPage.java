package userinterface;
import net.serenitybdd.screenplay.targets.Target;

public class AdvantageRegisterPage {


   public static final  Target LOGIN =Target.the("button profile").locatedBy("//button[@id='menuUserLink']");
   public static final  Target CREATE_ACCOUNT =Target.the("button create account").locatedBy("//a[.='CREATE NEW ACCOUNT']");
   public static final  Target USERNAME =Target.the("button username").locatedBy("//input[@name='usernameRegisterPage']");
   public static final  Target PASSWORD =Target.the("password").locatedBy("//input[@name='passwordRegisterPage']");
   public static final  Target EMAIL =Target.the("mail").locatedBy("//input[@name='emailRegisterPage']");
   public static final  Target CONFIRM_PASSWORD =Target.the("confirm email").locatedBy("//input[@name='confirm_passwordRegisterPage']");
   public static final  Target NAME =Target.the("name").locatedBy("//input[@name='first_nameRegisterPage']");
   public static final  Target LASTNAME =Target.the("lastname").locatedBy("//input[@name='last_nameRegisterPage']");
   public static final  Target PHONE_NUMBER =Target.the("phone number").locatedBy("//input[@name='phone_numberRegisterPage']");
   public static final  Target COUNTRY =Target.the("country").locatedBy("//select[@name='countryListboxRegisterPage']/option[.='{0}']");
   public static final  Target CITY =Target.the("city").locatedBy("//input[@name='cityRegisterPage']");
   public static final  Target ADDRESS =Target.the("address").locatedBy("//input[@name='addressRegisterPage']");
   public static final  Target STATE =Target.the("state").locatedBy("//input[@name='state_/_province_/_regionRegisterPage']");
   public static final  Target POSTAL_CODE =Target.the("postal code").locatedBy("//input[@name='postal_codeRegisterPage']");
   public static final  Target AGREE_REGISTER =Target.the("check conditions").locatedBy("//input[@name='i_agree']");
   public static final  Target REGISTER =Target.the("button register").locatedBy("//button[@id='register_btnundefined']");










}
