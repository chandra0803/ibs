package com.ibsplc.amadeus.types;

public enum MealType {

	/**
	 * Vegetarian Hindu Meal
	 */
	AVML("ASIAN VEGETARIAN MEAL"),

	/**
	 * Baby Meal
	 */
	BBML("BABY MEAL"),

	/**
	 * Bland Meal
	 */
	BLML("BLAND MEAL"),

	/**
	 * Child Meal
	 */
	CHML("CHILD MEAL"),

	/**
	 * Diabetic Meal
	 */
	DBML("DIABETIC MEAL"),

	/**
	 * Fruit Platter Meal
	 */
	FPML("FRUIT PLATTER MEAL"),

	/**
	 * Gluten Intolerant Meal
	 */
	GFML("GLUTEN INTOLERANT MEAL"),

	/**
	 * Hindu (Non Vegetarian) Meal
	 */
	HNML("HINDU (NON VEGETARIAN) MEAL "),

	/**
	 * Indian Vegetarian Meal
	 */
	IVML("INDIAN VEGETARIAN MEAL"),

	/**
	 * Japanese Meal
	 */
	JPML("JAPANESE MEAL"),

	/**
	 * Kosher Meal
	 */
	KSML("KOSHER MEAL"),

	/**
	 * Low Calorie Meal
	 */
	LCML("LOW CALORIE MEAL"),

	/**
	 * Low Fat Meal
	 */
	LFML("LOW FAT MEAL"),

	/**
	 * Low Salt Meal
	 */
	LSML("LOW SALT MEAL"),

	/**
	 * Moslem Meal
	 */
	MOML("MOSLEM MEAL"),

	/**
	 * No Fish Meal
	 */
	NFML("NO FISH MEAL"),

	/**
	 * Low Lactose Meal
	 */
	NLML("LOW LACTOSE MEAL"),

	/**
	 * Japanese Obento Meal
	 */
	OBML("JAPANESE OBENTO MEAL"),

	/**
	 * Regular Meal
	 */
	RML("REGULAR MEAL"),

	/**
	 * Vegetarian Raw Meal
	 */
	RVML("VEGETARIAN RAW MEAL"),

	/**
	 * Sea Food Meal
	 */
	SFML("SEA FOOD MEAL"),

	/**
	 * Special Meal, Specify Food
	 */
	SPML("SPECIAL MEAL, SPECIFY FOOD"),

	/**
	 * Vegetarian Vegan Meal
	 */
	VGML("VEGETARIAN VEGAN MEAL"),

	/**
	 * Vegetarian Jain Meal
	 */
	VJML("VEGETARIAN JAIN MEAL"),

	/**
	 * Vegetarian Oriental Meal
	 */
	VOML("VEGETARIAM ORIENTAL MEAL"),

	/**
	 * Vegetarian Lacto-Ovo Meal
	 */
	VLML("VEGETARIAN LACTO-OVO MEAL ");

	/**
	 * Description of the meal.
	 */
	private final String description;

	MealType(final String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	/**
	 * Used to check if a certain meal exists in this class.
	 *
	 * @param mealType
	 *            meal we want to check for.
	 * @return whether or not the meal exists.
	 */
	public static boolean containsValue(final String mealType) {
		for (final MealType meal : values()) {
			if (meal.name().equals(mealType)) {
				return true;
			}
		}
		return false;
	}
}
