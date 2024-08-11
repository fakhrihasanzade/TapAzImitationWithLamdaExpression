package service;

import entity.TapAz;

import java.util.List;

public interface TapAzService {

    //Verilen qiymete esasen onun asagisinda ve yuxarisinda olan malları getirmek ucun iki metod yazin
    List<TapAz> maxSearch(Integer price);
    List<TapAz> minSearch(Integer price);

    //Location-i Baki olan elanlari getirin
    List<TapAz> locationSearch(String city);

    //Catdirilmasi ve Yeni olması beli olanları getiren metod yazin
    List<TapAz> deliveryAndIsNew();

    //Markasi Apple olan malları getiren metod yazan
    List<TapAz> brandIsAplle();

    //Elaqe nomresi azercell olan seslerin mallarini getiren metod yazan
    List<TapAz> getNumberType();

    //Qiymetine ve mehsulun adına gore mallard getiren metod yazan
    List<TapAz> brandAndPrice(String brand,Integer price);

}
