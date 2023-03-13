package com.example.EShoppingCart.User.SD;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data@NoArgsConstructor
public class APIResponse<U> {
    private int status;
    private String message;

    public APIResponse(int status,String message)
    {
        this.status=status;
        this.message=message;
    }
}
