package edu.kis.vh.nursery;

/**
 * Klasa implementująca mechanizm liczenia wg zasad wieży Hanoi. Dziedziczy po
 * DefaultCountingOutRhymer, dodając sprawdzanie warunku: element można dodać
 * tylko jeśli jest mniejszy od elementu na szczycie stosu. Zlicza również
 * odrzucone próby dodania niepoprawnych elementów.
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {
	/**
	 * Licznik odrzuconych elementów (np. prób dodania większego elementu na
	 * mniejszy)
	 */
	private int totalRejected = 0;

	/**
	 * Zwraca liczbę odrzuconych elementów od początku działania programu.
	 * 
	 * @return Całkowita liczba odrzuceń
	 */
	public int reportRejected() {
		return totalRejected;
	}

	/**
	 * Próba dodania elementu na stos z uwzględnieniem reguł wieży Hanoi. Element
	 * zostanie odrzucony, jeśli: - stos nie jest pusty (callCheck() zwraca false) -
	 * nowy element jest większy od elementu na szczycie (in > peekaboo()) W
	 * przeciwnym razie element zostaje dodany do stosu.
	 */
	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
