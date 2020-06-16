package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             ImageMesh
 *
 * Full name:        System`ImageMesh
 *
 * Usage:            ImageMesh[image] returns the foreground region in image as a BoundaryMeshRegion object.
 *
 *                   AlignmentPoint -> Center
 *                   AnnotationRules -> {}
 *                   AspectRatio -> Automatic
 *                   AutomaticImageSize -> False
 *                   Axes -> False
 *                   AxesEdge -> Automatic
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   Boxed -> False
 *                   BoxRatios -> Automatic
 *                   BoxStyle -> {}
 *                   ControllerLinking -> False
 *                   ControllerMethod -> Automatic
 *                   ControllerPath -> Automatic
 *                   CornerNeighbors -> True
 *                   DataRange -> Automatic
 *                   Epilog -> {}
 *                   FaceGrids -> None
 *                   FaceGridsStyle -> {}
 *                   Frame -> False
 *                   FrameLabel -> None
 *                   FrameStyle -> {}
 *                   FrameTicks -> None
 *                   FrameTicksStyle -> {}
 *                   GridLines -> None
 *                   GridLinesStyle -> {}
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Automatic
 *                   LabelStyle -> {}
 *                   Lighting -> Automatic
 *                   MeshCellHighlight -> {}
 *                   MeshCellLabel -> Automatic
 *                   MeshCellMarker -> 0
 *                   MeshCellShapeFunction -> Automatic
 *                   MeshCellStyle -> Automatic
 *                   Method -> Automatic
 *                   PlotLabel -> None
 *                   PlotRange -> All
 *                   PlotRangeClipping -> False
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotTheme -> Automatic
 *                   Prolog -> {}
 *                   Properties -> {}
 *                   RotateLabel -> True
 *                   RotationAction -> Fit
 *                   SphericalRegion -> Automatic
 *                   Ticks -> Automatic
 *                   TicksStyle -> {}
 *                   TouchscreenAutoZoom -> Automatic
 *                   ViewAngle -> Automatic
 *                   ViewCenter -> Automatic
 *                   ViewMatrix -> Automatic
 *                   ViewPoint -> {1.3, -2.4, 2.}
 *                   ViewProjection -> Automatic
 *                   ViewRange -> All
 *                   ViewVector -> Automatic
 *                   ViewVertical -> {0, 0, 1}
 *                   DisplayFunction :> $DisplayFunction
 * Options:          PerformanceGoal :> $PerformanceGoal
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/ImageMesh
 * Documentation:    web: http://reference.wolfram.com/language/ref/ImageMesh.html
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
fun imageMesh(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("ImageMesh", arguments.toMutableList(), options)
}
