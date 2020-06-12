package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             FeatureExtraction
 *
 * Full name:        System`FeatureExtraction
 *
 *                   FeatureExtraction[{example , example , …}] generates a FeatureExtractorFunction[…] trained from the examples given.
 *                                             1         2
 *                   FeatureExtraction[examples, extractor] uses the specified feature extractor method.
 *                   FeatureExtraction[examples, {extractor , extractor , …}] applies the extractor  in sequence to generate a feature extractor.
 *                                                         1           2                           i
 *                   FeatureExtraction[examples, spec  ext] uses the extractor methods specified by ext on parts of examples specified by spec.
 *                   FeatureExtraction[examples, {spec   ext , spec   ext , …}] uses the extractor methods ext  on parts of examples specified by the spec .
 *                                                    1      1      2      2                                    i                                           i
 * Usage:            FeatureExtraction[examples, extractor, props] gives the feature extraction properties specified by props.
 *
 *                   FeatureNames -> Automatic
 *                   FeatureTypes -> Automatic
 *                   FeatureWeights -> Automatic
 *                   NominalVariables -> Automatic
 *                   OutputWrapper -> List
 *                   PerformanceGoal -> Automatic
 *                   ProcessorCaching -> False
 *                   RandomSeeding -> 1234
 *                   RecordLog -> True
 * Options:          Weights -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/FeatureExtraction
 * Documentation:    web: http://reference.wolfram.com/language/ref/FeatureExtraction.html
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
fun featureExtraction(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("FeatureExtraction", arguments.toMutableList(), options)
}
