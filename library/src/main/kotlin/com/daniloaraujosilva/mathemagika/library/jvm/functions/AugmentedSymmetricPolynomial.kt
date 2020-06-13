package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             AugmentedSymmetricPolynomial
 *
 * Full name:        System`AugmentedSymmetricPolynomial
 *
 *                   AugmentedSymmetricPolynomial[{r , r , …}] represents a formal augmented symmetric polynomial with exponents r , r , ….
 *                                                  1   2                                                                         1   2
 *                   AugmentedSymmetricPolynomial[{{r  , …, r  }, {r  , …, r  }, …}] represents a multivariate formal augmented symmetric polynomial with exponent vectors {r  , …, r  }, {r  , …, r  }, ….
 *                                                   11      1n     21      2n                                                                                               11      1n     21      2n
 * Usage:            AugmentedSymmetricPolynomial[rspec, data] gives the augmented symmetric polynomial in data.
 *
 * Options:          None
 *
 *                   NHoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/AugmentedSymmetricPolynomial
 * Documentation:    web: http://reference.wolfram.com/language/ref/AugmentedSymmetricPolynomial.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun augmentedSymmetricPolynomial(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("AugmentedSymmetricPolynomial", arguments.toMutableList(), options)
}
