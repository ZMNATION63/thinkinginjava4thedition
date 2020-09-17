package com.company.chapter19enumeratedtypes.examples.ex013securitycategory;

import com.company.chapter19enumeratedtypes.examples.ex09enums.Enums;

/**
 * Интерфейс Security необходим для объединения внутренних перечислений под общим типом.
 * Далее они классифицируются по перечислениям в SecurityCategory
 */
enum SecurityCategory {
    STOCK(Security.Stock.class), BOND(Security.Stock.class);
    Security[] values;

    SecurityCategory(Class<? extends Security> king) {
        values = king.getEnumConstants();
    }

    interface Security {
        enum Stock implements Security {SHORT, LONG, MARGIN}

        enum Bond implements Security {MUNICIPAL, JUNK}

    }

    public Security randomSelection() {
        return Enums.random(values);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            SecurityCategory category =
                    Enums.random(SecurityCategory.class);
            System.out.println(category + ": " +
                    category.randomSelection());
        }
    }
}
