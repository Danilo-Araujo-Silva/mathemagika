package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             ImagePeriodogram
 *
 * Full name:        System`ImagePeriodogram
 *
 *                   ImagePeriodogram[image] shows the squared magnitude of the discrete Fourier transform (power spectrum) of image.
 *                   ImagePeriodogram[image, n] shows the average of power spectra of non-overlapping partitions of size n×n.
 *                   ImagePeriodogram[image, n, d] uses partitions with offset d.
 *                   ImagePeriodogram[image, n, d, wfun] applies a smoothing window wfun to each partition.
 * Usage:            ImagePeriodogram[image, n, d, wfun, m] pads partitions with zeros to length m prior to the computation of the transform.
 *
 * Options:          Alignment -> Center
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImagePeriodogram
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImagePeriodogram.html
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
fun imagePeriodogram(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImagePeriodogram", arguments.toMutableList(), options)
}
