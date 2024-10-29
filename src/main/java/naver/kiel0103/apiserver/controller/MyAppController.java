package naver.kiel0103.apiserver.controller;

import naver.kiel0103.apiserver.controller.dto.ItemResponse;
import naver.kiel0103.apiserver.controller.dto.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAppController {

    @GetMapping("/")
    public ResponseEntity<ItemResponse<UserResponse>> index() {
        return ResponseEntity.ok(
                ItemResponse.<UserResponse>builder()
                        .result("success")
                        .item(UserResponse.builder()
                                .id(1L)
                                .name("김예림")
                                .build())
                        .build());
    }
}
