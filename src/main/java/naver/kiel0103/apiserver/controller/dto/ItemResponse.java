package naver.kiel0103.apiserver.controller.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ItemResponse<T> {

    private String result;
    private T item;
}
