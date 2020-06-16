package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ChanVeseBinarize
 *
 * Full name:        System`ChanVeseBinarize
 *
 *                   ChanVeseBinarize[image] finds a two-level segmentation of image by computing optimal contours around regions of consistent intensity in image.
 *                   ChanVeseBinarize[image, marker] uses marker to create an initial contour.
 *                   ChanVeseBinarize[image, marker, {μ, ν, λ , λ }] specify the Chan–Vese weights μ, ν, λ , and λ .
 * Usage:                                                    1   2                                        1       2
 *
 * Options:          MaxIterations -> 100
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ChanVeseBinarize
 * Documentation:    web: http://reference.wolfram.com/language/ref/ChanVeseBinarize.html
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
fun chanVeseBinarize(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ChanVeseBinarize", arguments.toMutableList(), options)
}
