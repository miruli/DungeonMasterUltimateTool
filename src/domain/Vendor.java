package domain;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("c9f5154b-1f51-4617-860b-da26345213ab")
public class Vendor {
    @objid ("5c2a5b52-7037-41e2-a44f-282ad6726e76")
    private List<Shop> shop = new ArrayList<Shop> ();

    @objid ("3ee91bec-d063-4311-9263-8b95b879c321")
    List<Shop> getShop() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.shop;
    }

    @objid ("15ee93f4-e18a-4f8b-a425-11bf49f149a2")
    void setShop(List<Shop> value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.shop = value;
    }

}
