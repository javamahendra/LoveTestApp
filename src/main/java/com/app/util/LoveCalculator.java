package com.app.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class LoveCalculator {
 private static List<String> getCount(String fname, String sname) {
  List<String> list = new ArrayList<String>();
  String love = "Love";
  String name1 = fname;
  String name2 = sname;
  for (int i = 0; i < name1.length(); i++) {
   String temp = name1.charAt(i) + "";

   if (list.contains(temp)) {
    int indexOfElement = list.indexOf(temp);
    int prevCount = Integer.parseInt(list.get(++indexOfElement).toString());
    prevCount++;
    String newCount = (prevCount) + "";
    list.set(indexOfElement, newCount);
    continue;
   }

   list.add(temp);
   list.add("1");
  }

  for (int i = 0; i < name2.length(); i++) {
   String temp = name2.charAt(i) + "";

   if (list.contains(temp)) {
    int indexOfElement = list.indexOf(temp);
    int prevCount = Integer.parseInt(list.get(++indexOfElement).toString());
    prevCount++;
    String newCount = (prevCount) + "";
    list.set(indexOfElement, newCount);
    continue;
   }

   list.add(temp);
   list.add("1");
  }

  for (int i = 0; i < love.length(); i++) {
   String temp = love.charAt(i) + "";

   if (list.contains(temp)) {
    int indexOfElement = list.indexOf(temp);
    int prevCount = Integer.parseInt(list.get(++indexOfElement).toString());
    prevCount++;
    String newCount = (prevCount) + "";
    list.set(indexOfElement, newCount);
    continue;
   }

   list.add(temp);
   list.add("1");
  }
  List<String> result = new ArrayList<String>();

  for (int i = 1; i < list.size(); i += 2) {
   result.add(list.get(i));
  }
  return result;
 }

 private static int getLovePercentage(String fname, String sname) {
  List<String> count = getCount(fname, sname);
  if (count.size() == 1) {
   String result = count.get(0).toString() + "";
   return Integer.parseInt(result);
  }

  if (count.size() == 2) {
   String result = count.get(0).toString() + count.get(1).toString();
   return Integer.parseInt(result);
  }

  do {
   List<String> sub = new ArrayList<String>();
   int size = count.size() / 2;
   for (int i = 0; i < size; i++) {
    String newC = (Integer.parseInt(count.get(i).toString()) + Integer.parseInt(count.get(count.size() - 1 - i).toString())) + "";

    if (newC.length() == 2) {
     sub.add((newC.charAt(0) + ""));
     sub.add((newC.charAt(1) + ""));
    } else {
     sub.add(newC);
    }
   }

   if ((size * 2) != count.size())
    sub.add(count.get(size));

   count = new ArrayList<String>();
   count = sub;
  } while (count.size() != 2);

  String result = count.get(0).toString() + count.get(1).toString();
  return Integer.parseInt(result);
 }

 public static Integer getLovePercentageResult(String fname, String sname) {
  int per = getLovePercentage(fname, sname);
  String result = "Love Percentage Between " + fname + " And " + sname + " is " + per + "% ";

  return per;
 }

 /*public static void main(String args[]) {
  System.out.println(LoveCalculator.getLovePercentageResult("RAGHU", "SIRISHA"));
 }*/
}
