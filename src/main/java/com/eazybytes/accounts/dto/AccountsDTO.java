package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDTO {

    @NotNull(message = "AccountNumber can not be null")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "AccountNumber must be 10 digits")
    @Schema(
            description = "Account Number of Eazy Bank account", example = "6444625321"
    )
    private Long accountNumber;

    @NotNull(message = "AccountType can not be null")
    @Schema(
            description = "Account type of Eazy Bank account", example = "Savings"
    )
    private String accountType;

    @NotNull(message = "BranchAddress can not be null")
    @Schema(
            description = "Eazy Bank branch address", example = "123 New York"
    )
    private String branchAddress;
}