package src.adapter.with_adapter;

import java.util.List;

public interface Tradable {

    void trade(String newOwner);

    void tradeUndo();

    public List <String>  getTradeHistory ();

}