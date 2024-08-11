package serviceimpl;

import entity.TapAz;
import service.TapAzService;
import service.CommonService;

import java.util.ArrayList;
import java.util.List;

public class TapAzServiceImpl implements CommonService<TapAz>, TapAzService {

    static List<TapAz> anons = new ArrayList<>();

    static {
        anons.add(new TapAz(1, "CosqunStore", "cosqun@gmail.com", 450, "0503924233", "Baku", "SmartWatch", "Apple", "Apple Watch", "Green", 40, true, false));
        anons.add(new TapAz(2, "AppleStore", "apple@gmail.com", 1500, "0703924233", "Baku", "phone", "Apple", "Iphone 13", "Midnight black", 40, true, false));
        anons.add(new TapAz(3, "AlmaStore", "alma@gmail.com", 450, "0554402066", "Gence", "SmartWatch", "Samsung", "Galaxy Watch", "orange", 40, true, false));
    }

    @Override
    public void add(TapAz object) {
        anons.add(object);
    }

    @Override
    public TapAz getById(Integer id) {
        return anons.stream().filter(store -> store.getId().equals(id)).toList().get(0);
    }

    @Override
    public List<TapAz> getAll() {
        return anons;
    }

    @Override
    public void deleteById(Integer id) {
        anons.remove(anons.stream().filter(store -> store.getId().equals(id)).toList().get(0));
    }

    @Override
    public void updateOfName(String Name, Integer id) {
        anons.get(id - 1).setName(Name);
    }

    @Override
    public List<TapAz> maxSearch(Integer price) {
        return anons.stream().filter(store -> store.getPrice() <= price).toList();
    }

    @Override
    public List<TapAz> minSearch(Integer price) {
        return anons.stream().filter(store -> store.getPrice() >= price).toList();
    }

    @Override
    public List<TapAz> locationSearch(String city) {
        return anons.stream().filter(store -> store.getCity().equals(city)).toList();
    }

    @Override
    public List<TapAz> deliveryAndIsNew() {
        return anons.stream().filter(store -> store.getNew() == true && store.getDelivery() == true).toList();
    }

    @Override
    public List<TapAz> brandIsAplle() {
        return anons.stream().filter(store -> store.getBrand().equals("Apple")).toList();
    }

    @Override
    public List<TapAz> getNumberType() {
        return anons.stream().filter(
                store -> store.getNumber().contains("050") || store.getNumber().contains("051")
                        || store.getNumber().contains("010")).toList();

    }

    @Override
    public List<TapAz> brandAndPrice(String brand, Integer price) {
        return anons.stream().filter(store -> store.getBrand().equals(brand)
                && store.getPrice().equals(price)).toList();
    }
}
