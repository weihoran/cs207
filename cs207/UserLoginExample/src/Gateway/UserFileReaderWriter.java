package Gateway;

import Entity.IUser;

import java.io.*;
import java.util.ArrayList;

public class UserFileReaderWriter {

    public void saveUserToFile(ArrayList userList){
        try
        {
            FileOutputStream fos = new FileOutputStream("UserData");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(userList);
            oos.close();
            fos.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public ArrayList readUserFromFile(){

        ArrayList userList = new ArrayList<>();

        try
        {
            File file = new File("UserData");
            file.createNewFile();
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);

            userList = (ArrayList) ois.readObject();
            ois.close();
            fis.close();
        }
         catch(EOFException e){
            userList = new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return userList;

    }

}
