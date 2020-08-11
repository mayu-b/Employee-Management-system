/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pay_roll;

/**
 *
 * @author GP
 */
public class employee 
{
    int Id;
    private String Name,Gender,DOB,Address,EmailId,MobileNo,Password,ConfirmPassword,Dept,Desig;
    private float BasicSalary;
    
    public String getDept()
    {
       return Dept;
    }
    
    public String getDesig()
    {
       return Desig;
    }
    
    public float getBasicSalary()
    {
        return BasicSalary;
    }
    public void setDesig(String desig)
    {
        Desig=desig;
    }
    public void setDept(String dept)
    {
        Dept=dept;
    }
    public void setBasicSalary(float salary)
    {
        BasicSalary=salary;
    }
    public int getId()
    {
        return Id;
    }
    public String getName()
    {
        return Name;
    }
    public String getGender()
    {
        return Gender;
    }
    public String getDOB()
    {
        return DOB;
    }
    public String getAddress()
    {
        return Address;
    }
    public String getEmailId()
    {
      return EmailId;  
    }
    public String getMobileNo()
    {
        return MobileNo;
    }
    public String getPassword()
    {
        return Password;
    }
    public String getConfirmPassword()
    {
        return ConfirmPassword;
    }
     public void setId(int id)
    {
        Id=id;
    }
    public void setName(String name)
    {
        Name=name;
    }
    public void setGender(String gender)
    {
         Gender=gender;
    }
    public void  setDOB(String DOB)
    {
        this.DOB=DOB;
    }
    public void setAddress(String Address)
    {
        this.Address= Address;
    }
    public void setEmailId(String EmailId)
    {
      this.EmailId= EmailId;  
    }
    public void setMobileNo(String mobileNo)
    {
        MobileNo=mobileNo;
    }
    public void setPassword(String pass)
    {
   Password=pass;
    }
    public void setConfirmPassword(String cp)
    {
         ConfirmPassword=cp;
    }    

    /*void setDesig(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
