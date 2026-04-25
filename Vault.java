public class Vault<T> {

    private T object;
    private String password;

    public Vault(T object, String password){
        this.object = object;
        this.password = password;
    }

    public T getObject(){ return object; }
    public String getPassword(){ return password; }
    public void setObject(T object){ this.object = object;}
    public void setPassword(String password){ this.password = password;}

    public T getVault(String inputPassword){
        if (inputPassword.equals(password)){
            return object;
        }
        return null;
    }

    public T updateVault(T newItem, String inputPassword){
        if (inputPassword.equals(password)){
            this.object = newItem;
            return object;
        }
        return null;
    }
}
