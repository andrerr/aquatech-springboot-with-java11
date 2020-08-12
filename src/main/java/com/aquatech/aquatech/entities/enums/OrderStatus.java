package com.aquatech.aquatech.entities.enums;

public enum OrderStatus {
	
	AGUARDANDO_PAGAMENTO(1),
	PAGAMENTO_EFETUADO(2),
	ENVIADO(2),
	ENTREGUE(3),
	CANCELADO(4);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Código de status inválido");
	}
}
