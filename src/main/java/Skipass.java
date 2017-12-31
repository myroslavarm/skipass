import java.util.Date;

public class Skipass {
    private int id;
    private String skipassType;
    private boolean activated = false;
    private boolean blocked = false;
    private Date activationDate;
    private Date expirationDate;

    public Skipass(int id, String type, Date activation, Date expiration) {
        this.id = id;
        this.skipassType = type;
        this.expirationDate = expiration;
        this.activationDate = activation;
    }

    public int getID() {
        return this.id;
    }

    public String getCardType() {
        return this.skipassType;
    }

    public Date getActivationDate() {
        return this.activationDate;
    }

    public Date getExpirationDate() {
        return this.expirationDate;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void block() {
        blocked = true;
    }

    public boolean isActivated() {
        return activated;
    }

    public void activate(){
        activated = true;
    }
}
