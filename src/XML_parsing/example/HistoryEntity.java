package XML_parsing.example;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "history", schema = "pisl")
public class HistoryEntity implements Serializable{
    private int id;
    private String product;
    private String market;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "PRODUCT")
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Basic
    @Column(name = "MARKET")
    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistoryEntity that = (HistoryEntity) o;
        return id == that.id &&
                Objects.equals(product, that.product) &&
                Objects.equals(market, that.market);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, product, market);
    }
}
