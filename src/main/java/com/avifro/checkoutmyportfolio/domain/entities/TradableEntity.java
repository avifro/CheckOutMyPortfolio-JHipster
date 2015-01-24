package com.avifro.checkoutmyportfolio.domain.entities;

import com.avifro.checkoutmyportfolio.domain.AbstractAuditingEntity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: froelica
 * Date: 05/01/2015
 * Time: 14:47
 */

@Document("T_TRADABLE_ENTITY")
public class TradableEntity extends AbstractAuditingEntity implements Serializable {

    @Id
    private String id;

    private String name;

    @NotNull
    private String value;

    @NotNull
    @Size(max = 5)
    private String symbol;

    @NotNull
    protected TradableEntityEnum type;

    @Field("origin_exchange_stock")
    @NotNull
    private StockExchangeEnum originExchangeStock;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TradableEntityEnum getType() {
        return type;
    }

    public void setType(TradableEntityEnum type) {
        this.type = type;
    }

    public StockExchangeEnum getOriginExchangeStock() {
        return originExchangeStock;
    }

    public void setOriginExchangeStock(StockExchangeEnum originExchangeStock) {
        this.originExchangeStock = originExchangeStock;
    }
}
