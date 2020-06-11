package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FaceAlign
 *
 * Full name:        System`FaceAlign
 *
 *                   FaceAlign[image] attempts to find faces in image and align them.
 *                   FaceAlign[image, fref] gives aligned faces according to the face reference fref.
 * Usage:            FaceAlign[image, fref, size] gives aligned faces of the specified size.
 *
 *                   Method -> Automatic
 *                   Padding -> Fixed
 *                   PaddingSize -> None
 *                   PerformanceGoal -> Speed
 *                   Resampling -> Automatic
 * Options:          TransformationClass -> Affine
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FaceAlign
 * Documentation:    web: http://reference.wolfram.com/language/ref/FaceAlign.html
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
fun faceAlign(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FaceAlign", arguments.toMutableList(), options)
}
