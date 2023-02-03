<template>
    <v-card 
      class="bg-deep-purple-lighten-2 blog"
    >
      <v-card-text>
        <div>Word of the Day</div>
        <p class="text-h4 text--primary">
          Тыгыдык
        </p>
        <p>adjective</p>
        <div class="text--primary">
            текст очень крутой здесь
        </div>
      </v-card-text>
      <v-card-actions>
        <v-btn
          variant="flat"
          color="teal-accent-4"
          @click="reveal = true"
        >
          Learn More
        </v-btn>
      </v-card-actions>
  
      <v-expand-transition>
        <v-card
          v-if="reveal"
          class="transition-fast-in-fast-out v-card--reveal"
          style="height: 100%;"
        >
          <v-card-text class="pb-0">
            <p class="text-h4 text--primary">
              Origin
            </p>
            <p>late 16th century (as a noun denoting a place where alms were distributed): from medieval Latin eleemosynarius, from late Latin eleemosyna ‘alms’, from Greek eleēmosunē ‘compassion’ </p>
          </v-card-text>
          <v-card-actions class="pt-0">
            <v-btn
              variant="text"
              color="teal-accent-4"
              @click="reveal = false"
            >
              Close
            </v-btn>
          </v-card-actions>
        </v-card>
      </v-expand-transition>
    </v-card>
  </template>
  <script>
  export default {
    data: () => ({
      reveal: false,
    }),
  }
</script>
<style>
.blog{
    margin: 1em;
    padding: 1em;

}
.v-card--reveal {
  bottom: 0;
  opacity: 1 !important;
  position: absolute;
  width: 100%;
}
</style>