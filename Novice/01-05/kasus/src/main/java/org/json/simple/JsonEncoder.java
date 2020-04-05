package org.json.simple;

import org.json.simple.JSONObject;


class JsonEncoder{
    public static void main(String[] args) {
        JSONObject obj = new JSONObject();
        obj.put("company", "volkswagen");
        obj.put("name","VW Combi");
        obj.put("price",20000000);
        System.out.println(obj);
    }
}