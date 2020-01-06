package org.teamshare.itschool.utils.converter;

public interface BiConverter<K,V> {
    V convertTo(K k);
    K convertFrom(V v);
}
