package com.rbs.interview.web.utils;

import org.springframework.data.domain.Sort;

public class SortingUtils {

    public static Sort orderBy(String op) {
        Sort sort = null;
        switch (op) {
            case "salAsc":
                sort = Sort.by(Sort.Order.asc("salary"));
                break;
            case "salDesc":
                sort = Sort.by(Sort.Order.desc("salary"));
                break;
            case "nmAsc":
                sort = Sort.by(Sort.Order.asc("employeeId"));
                break;
            case "nmDesc":
                sort = Sort.by(Sort.Order.asc("employeeName"));
                break;
            case "idAsc":
                sort = Sort.by(Sort.Order.asc("employeeName"));
                break;
            default:
                sort = Sort.by(Sort.Order.desc("employeeId"));
                break;
        }

        return sort;
    }
}
