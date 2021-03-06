package com.handbock.material.materialsciencehandbook.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        // Add some sample items.
        addItem(new DummyItem("  1","EP", "file:///android_asset/plastics/ep.html"));
        addItem(new DummyItem("  2","HDPE", "file:///android_asset/plastics/hdpe.html"));
        addItem(new DummyItem("  3","LDPE", "file:///android_asset/plastics/ldpe.html"));
        addItem(new DummyItem("  4","PA 6,6 NYLON", "file:///android_asset/plastics/PA 6,6 Nylon.html"));
        addItem(new DummyItem("  5","PC", "file:///android_asset/plastics/pc.html"));
        addItem(new DummyItem("  6","PEEK", "file:///android_asset/plastics/peek.html"));
        addItem(new DummyItem("  7","PET", "file:///android_asset/plastics/pet.html"));
        addItem(new DummyItem("  8","PF", "file:///android_asset/plastics/pf.html"));
        addItem(new DummyItem("  9","PMMA", "file:///android_asset/plastics/pmma.html"));
        addItem(new DummyItem("10","POM", "file:///android_asset/plastics/pom.html"));
        addItem(new DummyItem("11","PP", "file:///android_asset/plastics/pp.html"));
        addItem(new DummyItem("12","PS", "file:///android_asset/plastics/ps.html"));
        addItem(new DummyItem("13","PSU", "file:///android_asset/plastics/psu.html"));
        addItem(new DummyItem("14","PTFE", "file:///android_asset/plastics/ptfe.html"));
        addItem(new DummyItem("15","PUR", "file:///android_asset/plastics/pur.html"));
        addItem(new DummyItem("16","PVC", "file:///android_asset/plastics/pvc.html"));
        addItem(new DummyItem("17","PVDS", "file:///android_asset/plastics/pvds.html"));
        addItem(new DummyItem("18","SBR", "file:///android_asset/plastics/sbr.html"));
        addItem(new DummyItem("19","SI", "file:///android_asset/plastics/si.html"));





        addItem(new DummyItem("","", ""));
        addItem(new DummyItem("  A","Density", "file:///android_asset/properties/density.html"));
        addItem(new DummyItem("  B","Refractive index", "file:///android_asset/properties/refractive_index.html"));
        addItem(new DummyItem("  C","Tensile strength (yield)", "file:///android_asset/properties/tensile_strength.html"));
        addItem(new DummyItem("  D","Tensile modulus of elasticity E", "file:///android_asset/properties/tensile_modulus.html"));
        addItem(new DummyItem("  E","Flexural strength", "file:///android_asset/properties/flexural_strength.html"));
        addItem(new DummyItem("  F","Softening point", "file:///android_asset/properties/softening_point.html"));
        addItem(new DummyItem("  G","Glass transition temperature", "file:///android_asset/properties/glass_temperature.html"));
        addItem(new DummyItem("  H","Coefficient of the linear thermal expansion", "file:///android_asset/properties/thermal_expansion.html"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {
        return new DummyItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
