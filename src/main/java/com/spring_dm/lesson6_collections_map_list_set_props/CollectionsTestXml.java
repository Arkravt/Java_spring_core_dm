package com.spring_dm.lesson6_collections_map_list_set_props;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionsTestXml {

    private Map<String, Object> map;
    private Properties props;
    private Set<String> set;
    private List<String> list;

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void displayInfo() {
        System.out.println("Map content:");
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " - Value: " + entry.getValue());
        }
        System.out.println("____________________________________________________________________________");

        System.out.println("Property content:");
        for (Map.Entry<Object, Object> entry : props.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " - Value: " + entry.getValue());
        }
        System.out.println("____________________________________________________________________________");

        System.out.println("Set content:");
        for (String s : set) {
            System.out.println("Value: " + s);
        }
        System.out.println("____________________________________________________________________________");

        System.out.println("List content:");
        for (String s : list) {
            System.out.println("Value: " + s);
        }
        System.out.println("____________________________________________________________________________");
    }
}
