package utils;

import java.util.HashMap;
import java.util.Map;
import static java.time.LocalDate.parse;

import core.Brand;
import core.Colour;
import core.Material;
import core.Pen;

public class StoreUtilities {
	public static Map<Integer, Pen> populateMap() {
		Map<Integer, Pen> tempMap = new HashMap<Integer, Pen>();
		Pen p1 = new Pen(Brand.Cello, Colour.Black, Colour.Black, Material.Steel, parse("2023-06-05"), 25, 200);
		Pen p2 = new Pen(Brand.Airmail, Colour.Red, Colour.Black, Material.Alloy, parse("2023-09-01"), 10, 100);
		Pen p3 = new Pen(Brand.Parker, Colour.Blue, Colour.Blue, Material.Metal, parse("2023-01-06"), 5, 250.0);
		Pen p4 = new Pen(Brand.Reynolds, Colour.Black, Colour.Green, Material.Plastic, parse("2023-10-05"), 30, 20);
		tempMap.put(p1.getPenId(), p1);
		tempMap.put(p2.getPenId(), p2);
		tempMap.put(p3.getPenId(), p3);
		tempMap.put(p4.getPenId(), p4);
		return tempMap;
	}
}
