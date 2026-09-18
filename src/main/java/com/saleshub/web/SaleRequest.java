package com.saleshub.web; import jakarta.validation.constraints.*; import java.util.*;
public record SaleRequest(@NotNull Long sellerId,Long customerId,@NotEmpty List<Item> items,@NotBlank String paymentMethod,String coupon){ public record Item(@NotNull Long productId,@Min(1) int quantity){} }
