package starter.demoblaze.model;

public record PlaceOrderFormInfo(
        String name,
        String country,
        String city,
        String creditCard,
        Integer month,
        Integer year
) {
}
