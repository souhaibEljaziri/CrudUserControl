
import java.util.Date;

public class Acces {


    private boolean add;
    private boolean update;
    private boolean delete;
    private Date created_at;
    public Acces(boolean add, boolean update, boolean delete) {
        this.add = add;
        this.update = update;
        this.delete = delete;
        this.created_at = new Date();
    }

    public boolean isAdd() {
        return add;
    }

    public boolean isUpdate() {
        return update;
    }

    public boolean isDelete() {
        return delete;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Acces setAdd(boolean add) {
        this.add = add;
        return  this;
    }

    public Acces setUpdate(boolean update) {
        this.update = update;
        return this;
    }



    public Acces setDelete(boolean delete) {
        this.delete = delete;
        return this;
    }

    @Override
    public String toString() {
        return "Acces{" +
                "add=" + add +
                ", update=" + update +
                ", delete=" + delete +
                ", created_at=" + created_at +
                '}';
    }
}
