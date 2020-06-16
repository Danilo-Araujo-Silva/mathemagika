package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             DeconvolutionLayer
 *
 * Full name:        System`DeconvolutionLayer
 *
 *                   DeconvolutionLayer[n, sz] represents a trainable deconvolutional net layer having n output channels and using kernels of size sz to compute the deconvolution.
 *                   DeconvolutionLayer[n, {s}] represents a layer performing one-dimensional deconvolutions with kernels of size s.
 *                   DeconvolutionLayer[n, {h, w}] represents a layer performing two-dimensional deconvolutions with kernels of size h × w.
 * Usage:            DeconvolutionLayer[n, kernel, opts] includes options for initial kernels and other parameters.
 *
 *                   Biases -> Automatic
 *                   ChannelGroups -> 1
 *                   Input -> Automatic
 *                   Interleaving -> False
 *                   LearningRateMultipliers -> Automatic
 *                   Output -> Automatic
 *                   PaddingSize -> 0
 *                   Stride -> 1
 * Options:          Weights -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/DeconvolutionLayer
 * Documentation:    web: http://reference.wolfram.com/language/ref/DeconvolutionLayer.html
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
fun deconvolutionLayer(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DeconvolutionLayer", arguments.toMutableList(), options)
}
